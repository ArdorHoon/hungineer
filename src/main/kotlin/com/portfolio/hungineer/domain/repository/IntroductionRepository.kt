package com.portfolio.hungineer.domain.repository

import com.portfolio.hungineer.domain.entity.Achievement
import com.portfolio.hungineer.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long> {


}