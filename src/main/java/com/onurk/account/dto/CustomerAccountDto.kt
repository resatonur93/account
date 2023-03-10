package com.onurk.account.dto

import com.onurk.account.model.Transaction
import java.math.BigDecimal

data class CustomerAccountDto(
    val id: String,
    val balance: BigDecimal? = BigDecimal.ZERO,
    val transactions: Set<TransactionDto>?,


) {
}