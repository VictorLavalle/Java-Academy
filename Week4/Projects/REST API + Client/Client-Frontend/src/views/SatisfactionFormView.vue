<script setup lang="ts">
import TopBar from "@/components/TopBar.vue";
import Header from "@/components/Header.vue";
import Footer from "@/components/Footer.vue";
import {reactive, computed, ref } from "vue";
import type { ComputedRef, Ref } from "vue";
import type { SatisfactionFormData } from "@/types/types";
import { anotherInstance } from "@/axios/index";
import { Toast } from "bootstrap";
import { useI18n } from "vue-i18n";


const { t } = useI18n();

const toastDiv: Ref<HTMLDivElement | null> = ref(null);
const toastBody: Ref<HTMLDivElement | null> = ref(null);

const acceptedPrivacy: Ref<boolean> = ref(false);
const satisfactionData: SatisfactionFormData = reactive(
  emptySatisfactionFormData()
);

function emptySatisfactionFormData(): SatisfactionFormData {
  return {
    email: "",
    name: "",
    generalSatisfaction: 0,
    teacherSatisfaction: 0,
    checkpointSatisfaction: 0
  };
}

/* Field validations */
const validEmail: ComputedRef<boolean> = computed((): boolean => {
  if (!satisfactionData.email.includes("@")) return false;
  if (!satisfactionData.email.match(/@.+\..+$/)) return false;

  return true;
});

const validName: ComputedRef<boolean> = computed((): boolean =>
  satisfactionData.name.length ? true : false
);

const validGeneralSatisfaction: ComputedRef<boolean> = computed((): boolean => {
  if (satisfactionData.generalSatisfaction == 0) return false;
  return true;
});

const validTeacherSatisfaction: ComputedRef<boolean> = computed((): boolean => {
  if (satisfactionData.teacherSatisfaction == 0) return false;
  return true;
});

const validCheckpointSatisfaction: ComputedRef<boolean> = computed(
  (): boolean => {
    if (satisfactionData.checkpointSatisfaction == 0) return false;
    return true;
  }
);

const validSatisfactionFormData: ComputedRef<boolean> = computed(
  (): boolean => {
    if (
      validName.value &&
      validEmail.value &&
      validGeneralSatisfaction.value &&
      validTeacherSatisfaction.value &&
      validCheckpointSatisfaction.value &&
      acceptedPrivacy.value
    )
      return true;
    return false;
  }
);

/********************************
 * Send the form to the backend
 ********************************/
async function sendSatisfactionData(): Promise<void> {
  if (!toastDiv.value || !toastBody.value) return;

  const toast: Toast = new Toast(toastDiv.value);

  try {
    await anotherInstance.post("/satisfactionApplications", satisfactionData);

    toastDiv.value.classList.remove("text-bg-danger");
    toastDiv.value.classList.add("text-bg-success");

    toastBody.value.innerText = `Thanks you!. Information sent successfully`;

    Object.assign(satisfactionData, emptySatisfactionFormData());
  } catch {
    toastDiv.value.classList.remove("text-bg-success");
    toastDiv.value.classList.add("text-bg-danger");

    toastBody.value.innerText =
      "Something went wrong 😞. Please, try again later.";
  }

  toast.show();
}
</script>

<template>
  <main>
    <!-- Toast -->
    <div class="toast-container position-fixed bottom-0 end-0 p-3">
      <div
        ref="toastDiv"
        class="toast"
        role="alert"
        aria-live="assertive"
        aria-atomic="true">
        <div class="toast-header">
          <button
            type="button"
            class="btn-close"
            data-bs-dismiss="toast"
            aria-label="Close"></button>
        </div>
        <div ref="toastBody" class="toast-body">
          Hello, world! This is a toast message.
        </div>
      </div>
    </div>

    <TopBar />
    <Header />

    <div class="form container">
      <h1 class="text-center m-5">{{ t("joinUsForm.title") }}</h1>

      <p class="text-center">
        {{ t("satisfactionForm.description") }}
      </p>

      <!-- Full name -->
      <label
        class="form-label required-input"
        :class="{ 'text-danger': !validName }"
        >{{ t("joinUsForm.questions.name") }}</label
      >
      <input
        type="email"
        class="form-control space-below"
        :class="{ 'border-danger': !validName }"
        v-model="satisfactionData.name" />

      <!-- Email -->
      <label
        class="form-label required-input"
        :class="{ 'text-danger': !validEmail }"
        >{{ t("joinUsForm.questions.email") }}</label
      >
      <input
        type="email"
        class="form-control space-below"
        :class="{ 'border-danger': !validEmail }"
        v-model="satisfactionData.email" />

      <!-- General Satisfaction -->
      <label
        class="form-label required-input"
        :class="{ 'text-danger': !validGeneralSatisfaction }"
        >{{ t("satisfactionForm.questions.generalSatisfaction") }}</label
      >
      <select
        v-model="satisfactionData.generalSatisfaction"
        class="form-select space-below"
        :class="{ 'border-danger': !validGeneralSatisfaction }">
        <option :value="0" />
        <option :value="t('satisfactionForm.options.1')">
          {{ t("satisfactionForm.options.1") }}
        </option>
        <option :value="t('satisfactionForm.options.2')">
          {{ t("satisfactionForm.options.2") }}
        </option>
        <option :value="t('satisfactionForm.options.3')">
          {{ t("satisfactionForm.options.3") }}
        </option>
        <option :value="t('satisfactionForm.options.4')">
          {{ t("satisfactionForm.options.4") }}
        </option>
      </select>

      <!-- Teacher Satisfaction -->
      <label
        class="form-label required-input"
        :class="{ 'text-danger': !validTeacherSatisfaction }"
        >{{ t("satisfactionForm.questions.teacherSatisfaction") }}</label
      >
      <select
        v-model="satisfactionData.teacherSatisfaction"
        class="form-select space-below"
        :class="{ 'border-danger': !validTeacherSatisfaction }">
        <option :value="0" />
        <option :value="t('satisfactionForm.options.1')">
          {{ t("satisfactionForm.options.1") }}
        </option>
        <option :value="t('satisfactionForm.options.2')">
          {{ t("satisfactionForm.options.2") }}
        </option>
        <option :value="t('satisfactionForm.options.3')">
          {{ t("satisfactionForm.options.3") }}
        </option>
        <option :value="t('satisfactionForm.options.4')">
          {{ t("satisfactionForm.options.4") }}
        </option>
      </select>

      <!-- Checkpoint Satisfaction -->
      <label
        class="form-label required-input"
        :class="{ 'text-danger': !validCheckpointSatisfaction }"
        >{{ t("satisfactionForm.questions.checkpointSatisfaction") }}</label
      >
      <select
        v-model="satisfactionData.checkpointSatisfaction"
        class="form-select space-below"
        :class="{ 'border-danger': !validCheckpointSatisfaction }">
        <option :value="0" />
        <option :value="t('satisfactionForm.options.1')">
          {{ t("satisfactionForm.options.1") }}
        </option>
        <option :value="t('satisfactionForm.options.2')">
          {{ t("satisfactionForm.options.2") }}
        </option>
        <option :value="t('satisfactionForm.options.3')">
          {{ t("satisfactionForm.options.3") }}
        </option>
        <option :value="t('satisfactionForm.options.4')">
          {{ t("satisfactionForm.options.4") }}
        </option>
      </select>


      <div class="form-check">
        <input
          v-model="acceptedPrivacy"
          type="checkbox"
          class="form-check-input" />
        <label
          v-html="t('joinUsForm.privacyPoints.privacyPolicy')"
          class="form-check-label space-below" />
      </div>
    </div>

    <div class="row g-0 justify-content-center mb-5 mt-3">
      <div class="col-auto">
        <button
          @click="sendSatisfactionData"
          :disabled="!validSatisfactionFormData"
          :class="{ disabled: !validSatisfactionFormData }">
          {{ t("joinUsForm.buttonSubmit.text") }}<i class="bi bi-envelope" />
        </button>
      </div>
    </div>

    <Footer />
  </main>
</template>

<style scoped lang="scss">
$animationFast: 250ms;

.space-below {
  margin-bottom: $spacer;
}

.disabled {
  filter: opacity(0.5) !important;
}

.col-auto {
  button {
    background: $colorPrimary;
    border: 0;
    border-radius: 8px;
    padding: 10px 24px;
    color: #fff;
    transition: all 0.3s ease-in-out;
    border-radius: 4px;
    margin-top: 1.2rem;
  }

  button:hover {
    background: #293a58;
    transform: translateY(-2px);
    box-shadow: 0 3px 6px rgba(0, 0, 0, 0.16), 0 3px 6px rgba(0, 0, 0, 0.23);
    transition: all 0.3s ease-in-out;
  }

  button i {
    margin-left: 10px;
    font-size: 18px;
  }
}

.slide-fade-enter-active {
  transition: all $animationFast ease-out;
}

.slide-fade-leave-active {
  transition: all $animationFast cubic-bezier(1, 0.5, 0.8, 1);
}

.slide-fade-enter-from,
.slide-fade-leave-to {
  transform: translateX(20px);
  opacity: 0;
}

.required-input::before {
  content: "*";
  color: $danger;
  margin-right: 0.25rem;
}

#stateCity-input {
  margin-top: 0.8rem;
}

#phone-input-label {
  margin-right: 50rem;

  @media screen and (max-width: 768px) {
    margin-right: 0;
  }
}
</style>
