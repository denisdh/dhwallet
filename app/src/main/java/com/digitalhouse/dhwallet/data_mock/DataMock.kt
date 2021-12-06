package com.digitalhouse.dhwallet.data_mock

import com.digitalhouse.dhwallet.model.GroupTransaction
import com.digitalhouse.dhwallet.model.GroupType

class DataMock {

    fun dataTransaction() : MutableList<GroupTransaction>{
        return mutableListOf(
            GroupTransaction(
                type = GroupType.TITLE,
                title = "Hoje"
            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Dribble Inc",
                subtitle = "Pagamento",
                value = "+ R$ 45",
                image = "https://w7.pngwing.com/pngs/826/884/png-transparent-dribbble-logo-graphic-design-design-web-design-user-interface-design-photography-thumbnail.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Spotify Family",
                subtitle = "Pagamento",
                value = "- R$ 163",
                image = "https://cdn.icon-icons.com/icons2/2429/PNG/512/spotify_logo_icon_147234.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Netflix",
                subtitle = "Pagamento",
                value = "- R$ 15",
                image = "https://assets.b9.com.br/wp-content/uploads/2016/06/netflix-logo-thumb.jpg"

            ),
            GroupTransaction(
                type = GroupType.TITLE,
                title = "Qua, 10 de nov."
            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Dribble Inc",
                subtitle = "Pagamento",
                value = "+ R$ 45",
                image = "https://w7.pngwing.com/pngs/826/884/png-transparent-dribbble-logo-graphic-design-design-web-design-user-interface-design-photography-thumbnail.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Spotify Family",
                subtitle = "Pagamento",
                value = "- R$ 163",
                image = "https://cdn.icon-icons.com/icons2/2429/PNG/512/spotify_logo_icon_147234.png"

            ),
            GroupTransaction(
                type = GroupType.CONTENT,
                title = "Netflix",
                subtitle = "Pagamento",
                value = "- R$ 15",
                image = "https://assets.b9.com.br/wp-content/uploads/2016/06/netflix-logo-thumb.jpg"

            ),
        )
    }

}
