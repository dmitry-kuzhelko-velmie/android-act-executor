package com.velmie.actexecutor

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import com.velmie.actexecutor.act.Act
import com.velmie.actexecutor.act.Id
import com.velmie.actexecutor.act.LiveDataAct

fun <T : Any> LiveData<T>.toAct(
    id: Id,
    delay: Int,
    lifecycleOwner: LifecycleOwner,
    doAfterAct: (T) -> Unit
): Act = LiveDataAct(id, delay, this, lifecycleOwner, doAfterAct)
