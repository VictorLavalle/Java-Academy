<script setup lang="ts">
import { onMounted, ref } from "vue";
import { useI18n } from "vue-i18n";

import axios from "axios";

const { t } = useI18n();

const message = ref("");

async function retrieveData(): Promise<void> {
  try {
    await axios
      .get("https://jsonplaceholder.typicode.com/posts/1")
      .then((response) => {
        message.value = response.data.title;
      });
  } catch {
    console.log("Error");
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
        <div class="col-12">
          <h1>{{ message }}</h1>
        </div>
      </div>
    </div>
  </section>
</template>

<style scoped lang="scss"></style>
