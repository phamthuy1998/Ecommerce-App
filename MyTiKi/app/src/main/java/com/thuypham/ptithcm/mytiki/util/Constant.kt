package com.thuypham.ptithcm.mytiki.util

object Constant {
    // Account
    const val MY_PREFERENCES = "myPreferences"
    const val EMAIL_OR_PHONE = "emailorphone"
    const val PASSWORD = "password"
    const val IS_LOGIN = "isLogin"
    const val EMAIL = "email"
    const val USER = "USER"
    const val BIRTHDAY = "birthday"
    const val DAY_CREATE = "daycreate"
    const val GENDER = "gender"
    const val NAME = "name"
    const val PHONE = "phone"

    // product
    const val PRODUCT_ID = "id"
    const val PRODUCT = "PRODUCT"
    const val PRODUCT_SOLD = "sold"
    const val PRODUCT_SALE = "sale"
    const val NAME_PRODUCT = "name"
    const val PRICE_PRODUCT = "price"
    const val IMAGE_PRODUCT = "image"
    const val INFO_PRODUCT = "infor"
    const val  PRODUCT_COUNT= "product_count"
    const val ID_PROVIDER = "id_provider"
    const val ID_CATEGORY_PRODUCT = "id_category"

    //Category
    const val CATEGORY = "CATEGORY"
    const val CATEGORY_ID = "id"
    const val CATEGORY_NAME = "name"
    const val CATEGORY_IMAGE = "image"
    const val CATEGORY_COUNT = "category_count"

    // advertisement
    const val SLIDE = "SLIDE"
    const val NAME_AVT = "name"
    const val AVT_ID_CATEGORY = "id_category"
    const val AVT_NAME_CATEGORY = "name_category"
    const val ID_AVT = "id"
    const val IMAGE_AVT = "image"

    //viewed products
    const val VIEWED_PRODUCT = "viewed_product"
    const val VIEWED_PRODUCT_ID = "id"

    // rating product
    const val RATE = "RATE"
    const val RATE_ID = "id"
    const val RATE_COUNT = "rate_count"
    const val RATE_TIME = "time"
    const val RATE_CONTENT = "content"
    const val RATE_IMAGE = "image"
    const val RATE_ID_ACC = "id_acc"
    const val RATE_ID_PRODUCT = "id_product"

    //favorite_product
    const val FAVORITE_PRODUCT = "favorite_product"
    const val FAVORITE_ID = "id"

    //Cart
    const val CART = "CART"
    const val CART_ID = "id"
    const val CART_NUMBER = "number"

    //Cart
    const val ADDRESS = "ADDRESS"
    const val ADDRESS_ID = "id"
    const val ADDRESS_PHONE = "phone"
    const val ADDRESS_name = "name"
    const val ADDRESS_DEFAULT = "default"
    const val ADDRESS_REAL = "address"

    const val Shipping = 20000
    const val PriceLeast = 100000
    const val coefficientMorning = 1// 7 -> 11 h
    const val coefficientLunch = 1.2// 11 -> 13
    const val coefficientAft = 0.9// 13 -> 18
    const val coefficientNight = 1.5//18 --> 23
    const val coefficientMidNight = 0.9// 0 --> 7

    //Order
    const val ORDER = "ORDER"
    const val ORDER_ID = "id"
    const val ORDER_ID_ADDRESS = "id_address"
    const val ORDER_DATE = "date"
    const val ORDER_PRICE = "price"
    const val ORDER_STATUS = "status"
    const val ORDER_ID_USER = "id_user"

    //Order
    const val ORDER_DETAIL = "ORDER_DETAIL"
    const val ORDER_DETAIL_ID = "id"
    const val ORDER_DETAIL_PRODUCT_IMAGE = "image_product"
    const val ORDER_DETAIL_PRODUCT_NAME = "product_name"
    const val ORDER_DETAIL_ID_PRODUCT = "id_product"
    const val ORDER_DETAIL_PRODUCT_COUNT = "product_count"
    const val ORDER_DETAIL_PRODUCT_PRICE = "product_price"
    const val ORDER_DETAIL_ID_ORDER = "id_order"

}
// Error auth
const val ERR_EMAIL_VERIFY = "Email has not been verify!"
const val ERR_EMAIL_NOT_Exist = "Email does't exist!"
const val ERR_INCORRECT_PW = "Incorrect password!"
const val ERR_WEAK_PASSWORD =
    "The password is too weak, the password consists of at least 6 characters!"
const val ERR_EMAIL_INVALID = "Email invalidate!"
const val ERR_EMAIL_EXIST = "Email already exists!"