package com.coin.dispenser.repository;

import com.coin.dispenser.entity.CoinDispenserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinDispenserRespository extends JpaRepository<CoinDispenserEntity, Long> {
}
