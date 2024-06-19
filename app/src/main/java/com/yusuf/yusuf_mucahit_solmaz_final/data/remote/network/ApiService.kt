package com.yusuf.yusuf_mucahit_solmaz_final.data.remote.network

import com.yusuf.yusuf_mucahit_solmaz_final.data.remote.responses.cart.AddCartRequest
import com.yusuf.yusuf_mucahit_solmaz_final.data.remote.responses.cart.AddCartResponse
import com.yusuf.yusuf_mucahit_solmaz_final.data.remote.responses.category.RootCategoryResponse
import com.yusuf.yusuf_mucahit_solmaz_final.data.remote.responses.product.Product
import com.yusuf.yusuf_mucahit_solmaz_final.data.remote.responses.product.RootProductResponse
import com.yusuf.yusuf_mucahit_solmaz_final.data.remote.responses.userCart.RootUserCart
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {

    @GET("products")
    suspend fun getProducts(): Response<RootProductResponse>

    @GET("products/categories")
    suspend fun getProductsCategory(): Response<RootCategoryResponse>

    @GET("products/category/{categoryName}")
    suspend fun getProductsByCategory(@Path("categoryName") category: String): Response<RootProductResponse>

    @GET("products/{id}")
    suspend fun getProductsById(@Path("id") id: String): Response<Product>

    @Headers("Content-Type: application/json")
    @POST("carts/add")
    suspend fun addToCart(@Body request: AddCartRequest): Response<AddCartResponse>


    @GET("carts/user/{userId}")
    suspend fun getUserCartByUserId(@Path("userId") userId: Int): Response<RootUserCart>

    @GET("carts")
    suspend fun getUserCart(): Response<RootUserCart>

}
