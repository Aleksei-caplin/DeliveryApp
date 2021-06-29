package ru.skillbranch.sbdelivery.domain.filter

import android.util.Log
import io.reactivex.rxjava3.core.Single
import ru.skillbranch.sbdelivery.domain.entity.DishEntity
import ru.skillbranch.sbdelivery.repository.DishesRepositoryContract

class CategoriesFilterUseCase(private val repository: DishesRepositoryContract) : CategoriesFilter {
    override fun categoryFilterDishes(categoryId: String): Single<List<DishEntity>> {

        val result = repository.getCachedDishes()
        Log.d("M_catFilter", "ok")

        return result
    }
}