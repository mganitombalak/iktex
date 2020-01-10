import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProductManagementRoutingModule } from './product-management-routing.module';
import { ProductListComponent } from './components/product-list/product-list.component';
import { ProductService } from './services/product.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [ProductListComponent],
  imports: [
    CommonModule,
    HttpClientModule,
    ProductManagementRoutingModule
  ],
  providers: [ProductService]
})
export class ProductManagementModule { }
