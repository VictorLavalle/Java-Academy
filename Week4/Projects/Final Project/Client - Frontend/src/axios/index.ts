import axios from "axios";
import type { AxiosInstance } from "axios";

const instance: AxiosInstance = axios.create();
instance.defaults.baseURL =
    "http://localhost:9090/api/v1";

export default instance;
