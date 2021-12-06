package com.digitalhouse.dhwallet.model

class GroupTransaction (

    val type: GroupType,
    val title: String? = null,
    val image: String? = null,
    val subtitle: String? = null,
    val value: String? = null,

)

enum class GroupType{
    TITLE,
    CONTENT
}