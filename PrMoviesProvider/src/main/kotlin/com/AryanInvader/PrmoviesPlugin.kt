package com.AryanInvader

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class PrmoviesPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(PrmoviesProvider())
    }
}
