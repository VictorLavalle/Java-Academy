<script setup lang="ts">
import { onMounted, ref } from "vue";
import { useI18n } from "vue-i18n";
import instance from "@/axios/index";
import type { AcademyFormDataRetrieve } from "@/types/types";

const { t } = useI18n();

const message = ref<AcademyFormDataRetrieve[]>([]);


async function retrieveData(): Promise<void> {
  try {
    await instance.get("/academyApplications").then((response) => {
      message.value = response.data;
    });
  } catch (error) {
    console.error(error);
  }
}

async function deleteMember(id: number): Promise<void> {
  try {
    await instance.delete(`/academyApplications/${id}`).then((response) => {
      retrieveData();
    });

  } catch (error) {
    console.error(error);
  }
}

onMounted(() => {
  retrieveData();
});
</script>

<template>
  <section id="main" class="main">
    <div class="container">
      <div class="row">
        <div class="col-12 pt-5">
          <div class="text-center">
            <h2>{{ t("mainSection.title") }}</h2>
          </div>
          <div class="table-date pt-3">
            <table class="table table-striped table-hover text-center">
              <thead>
                <tr>
                  <th>{{ t("mainSection.tableHeaders.name") }}</th>
                  <th>{{ t("mainSection.tableHeaders.email") }}</th>
                  <th>{{ t("mainSection.tableHeaders.phone") }}</th>
                  <th>{{ t("mainSection.tableHeaders.stateCity") }}</th>
                  <th>{{ t("mainSection.tableHeaders.githubUrl") }}</th>
                  <th>{{ t("mainSection.tableHeaders.career") }}</th>
                  <th>{{ t("mainSection.tableHeaders.role") }}</th>
                  <th>{{ t("mainSection.tableHeaders.skills") }}</th>
                  <th>{{ t("mainSection.tableHeaders.englishLevel") }}</th>
                  <th>{{ t("mainSection.tableHeaders.otherLangs") }}</th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="data in message" :key="data.id">
                  <td>{{ data.name }}</td>
                  <td>{{ data.email }}</td>
                  <td>{{ data.phone }}</td>
                  <td>{{ data.stateCity }}</td>
                  <td><a :href="data.githubUrl" target="_blank">{{ data.githubUrl }}</a></td>
                  <td>{{ data.career }}</td>
                  <td>{{ data.role }}</td>
                  <td>{{ data.skills }}</td>
                  <td>{{ data.englishLevel }}</td>
                  <td>{{ data.otherLanguages }}</td>
                  <td>
                    <button class="btn btn-danger" @click="deleteMember(data.id)">
                      {{ t("mainSection.tableHeaders.delete") }}
                    </button>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<style scoped lang="scss"></style>
