import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CategoryManagementRoutingModule } from './category-management-routing.module';
import { CategoryListComponent } from './components/category-list/category-list.component';


@NgModule({
  declarations: [CategoryListComponent],
  imports: [
    CommonModule,
    CategoryManagementRoutingModule
  ]
})
export class CategoryManagementModule { }
