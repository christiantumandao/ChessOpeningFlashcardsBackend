package com.chessOpeningFlashcards.backend.addedOpenings;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "added_openings_table")
public class AddedOpening {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "fen")
    private String fen;

    @Column(name = "moves")
    private String moves;

    @Column(name = "eco")
    private String eco;

    @Column(name = "opening_name")
    private String opening_name;

    public AddedOpening(String fen, String moves, String eco, String opening_name) {
        this.fen = fen;
        this.moves = moves;
        this.eco = eco;
        this.opening_name = opening_name;
    }

    public void setFen(String fen) {
        this.fen = fen;
    }

    public String getFen() {
        return this.fen;
    }

    public void setEco(String eco) {
        this.eco = eco;
    }

    public String getEco() {
        return this.eco;
    }

    public void setOpeningName(String openingName) {
        this.opening_name = openingName;
    }

    public String getOpeningName() {
        return this.opening_name;
    }

    public void setMoves(String moves) {
        this.moves = moves;
    }

    public String getMoves() {
        return this.moves;
    }
}
