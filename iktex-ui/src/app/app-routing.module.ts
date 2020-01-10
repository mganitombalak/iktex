import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [
  {path:'category-mgmt', loadChildren:"./modules/category-management/category-management.module#CategoryManagementModule"},
  {path:'product-mgmt', loadChildren:"./modules/product-management/product-management.module#ProductManagementModule"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
