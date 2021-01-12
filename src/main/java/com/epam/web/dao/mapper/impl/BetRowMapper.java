package com.epam.web.dao.mapper.impl;

import com.epam.web.dao.mapper.RowMapper;
import com.epam.web.model.entity.Bet;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BetRowMapper implements RowMapper<Bet> {

    @Override
    public Bet map(ResultSet resultSet) throws SQLException {
        long id = resultSet.getLong(Bet.ID);
        long accountId = resultSet.getLong(Bet.ACCOUNT_ID);
        long matchId = resultSet.getLong(Bet.MATCH_ID);
        int moneyBet = resultSet.getInt(Bet.MONEY_BET);
        int moneyReceived = resultSet.getInt(Bet.MONEY_RECEIVED);
        String team = resultSet.getString(Bet.TEAM);

        return new Bet(id, accountId, matchId, moneyBet, team, moneyReceived);
    }
}