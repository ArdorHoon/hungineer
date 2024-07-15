package com.portfolio.hungineer.domain.repository

import com.portfolio.hungineer.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long> {


}