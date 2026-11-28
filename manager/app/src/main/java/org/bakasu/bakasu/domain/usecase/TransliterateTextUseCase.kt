<<<<<<<< HEAD:manager/app/src/main/java/com/tesla/resukisuultra/domain/usecase/TransliterateTextUseCase.kt
package com.tesla.resukisuultra.domain.usecase

import com.tesla.resukisuultra.domain.text.TextTransliterator
========
package org.bakasu.bakasu.domain.usecase

import org.bakasu.bakasu.domain.text.TextTransliterator
>>>>>>>> resukisu/main:manager/app/src/main/java/org/bakasu/bakasu/domain/usecase/TransliterateTextUseCase.kt

class TransliterateTextUseCase(private val transliterator: TextTransliterator) {
    operator fun invoke(value: String): String = transliterator.transliterate(value)
}
