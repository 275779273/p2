package com.itcast.dao;

import com.itcast.domain.Items;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsDao {
    Items find(Integer id);
}
