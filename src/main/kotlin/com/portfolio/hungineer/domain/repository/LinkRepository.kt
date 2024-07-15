package com.portfolio.hungineer.domain.repository

import com.portfolio.hungineer.domain.entity.Achievement
import com.portfolio.hungineer.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long> {


}