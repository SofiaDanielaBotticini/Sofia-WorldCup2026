package com.istea.worldcup.navigation

import androidx.navigation.NavController

class RouterImpl(val navController: NavController): Router {

    override fun openGroupDetail(groupId: String) {
        navController.navigate("detalle/$groupId") // // ****************** Consigna (4) ******************
    }

    override fun back() {
        navController.popBackStack()
    }
}