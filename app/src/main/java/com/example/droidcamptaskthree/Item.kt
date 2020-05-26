package com.example.droidcamptaskthree

data class Item(val name: String, val price: String, val image: Int)

const val ITEM_NAME = "ITEM_NAME"
const val ITEM_PRICE = "ITEM_PRICE"
const val ITEM_IMAGE = "ITEM_IMAGE"

object ItemSupplier {
    val items = listOf(
        Item("Item Number 1", "$300", R.drawable.applelogoone),
        Item("Macbook Air 2018", "$1390", R.drawable.macbook_air_1),
        Item("iMac Monitor", "$2235", R.drawable.imac_1),
        Item("Macbook Pro", "$1300", R.drawable.macbook_pro_1),
        Item("Redmi Note 9S", "$300", R.drawable.redmi_note_9s_1),
        Item("Galaxy S10", "$235", R.drawable.galaxy_s10_2),
        Item("Galaxy S20", "$600", R.drawable.galaxy_s20_1),
        Item("iMac 2019", "$2390", R.drawable.imac_2019_1),
        Item("Item Number 9", "$235", R.drawable.applelogoone),
        Item("Macbook Pro 2019", "$1300", R.drawable.macbook_pro_2019_1),
        Item("Dre Headset RED", "$790", R.drawable.dre_headphone__red_1),
        Item("Item Number 12", "$235", R.drawable.ironthrone),
        Item("Dre BLACK", "$600", R.drawable.dre_headphone_black_1),
        Item("Dre Headset WHITE", "$590", R.drawable.dre_headphone_white_1),
        Item("Item Number 15", "$235", R.drawable.ironthrone),
        Item("Item Number 16", "$300", R.drawable.ironthrone),
        Item("Item Number 17", "$390", R.drawable.applelogoone),
        Item("Hp Envy", "$2500", R.drawable.hp_envy_1),
        Item("HP Spectre", "$2300", R.drawable.hp_spectre_1),
        Item("Item Number 20", "$390", R.drawable.applelogoone),
        Item("Infinix Note 7", "$235", R.drawable.infinix_note_7_1),
        Item("Item Number 22", "$300", R.drawable.applelogoone),
        Item("iPhone 11 Pro", "$1390", R.drawable.iphone_11_pro_1),
        Item("Tecno Camon 15", "$235", R.drawable.tecno_camon_15_1),
        Item("Tecno Spark 5", "$300", R.drawable.tecno_spark_5_1),
        Item("Item Number 26", "$390", R.drawable.ironthrone),
        Item("Item Number 27", "$235", R.drawable.ironthrone),
        Item("Item Number 28", "$300", R.drawable.ironthrone),
        Item("Item Number 29", "$390", R.drawable.ironthrone),
        Item("Item Number 30", "$235", R.drawable.ironthrone),
        Item("Item Number 31", "$300", R.drawable.ironthrone),
        Item("Item Number 32", "$390", R.drawable.ironthrone),
        Item("Item Number 33", "$235", R.drawable.ironthrone),
        Item("Item Number 34", "$300", R.drawable.ironthrone),
        Item("Item Number 35", "$390", R.drawable.applelogoone),
        Item("Item Number 36", "$235", R.drawable.applelogoone),
        Item("Item Number 37", "$300", R.drawable.applelogoone),
        Item("Item Number 38", "$390", R.drawable.applelogoone),
        Item("Item Number 39", "$235", R.drawable.applelogoone),
        Item("Item Number 40", "$300", R.drawable.applelogoone),
        Item("Item Number 41", "$390", R.drawable.applelogoone),
        Item("Item Number 42", "$235", R.drawable.applelogoone),
        Item("Item Number 43", "$300", R.drawable.applelogoone),
        Item("Item Number 44", "$390", R.drawable.applelogoone),
        Item("Item Number 45", "$235", R.drawable.ironthrone),
        Item("Item Number 46", "$650", R.drawable.ironthrone),
        Item("Item Number 47", "$999", R.drawable.ironthrone),
        Item("Item Number 48", "$1000", R.drawable.ironthrone),
        Item("Item Number 49", "$860", R.drawable.ironthrone),
        Item("Item Number 50", "$350", R.drawable.ironthrone))
}