import { HttpClient, httpResource } from "@angular/common/http"
import { inject } from "@angular/core"

const hhtp=inject(HttpClient)
export function load(){
    return http.get("https://jsonplaceholder.typicode.com");
}