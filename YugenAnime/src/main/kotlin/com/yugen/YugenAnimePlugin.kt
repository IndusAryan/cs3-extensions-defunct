package com.yugen

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class YugenAnimePlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(YugenAnime())
    }
}