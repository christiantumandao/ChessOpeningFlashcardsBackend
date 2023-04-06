package com.chessOpeningFlashcards.backend.openings;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "opening_table")
public class Opening {

    @Id
    @Column(name = "fen")
    private String fen;

    @Column(name = "eco")
    private String eco;

    @Column(name = "moves")
    private String moves;

    @Column(name = "openingName")
    private String openingName;

    // default constructor
    public Opening() {

    }

    public Opening(String fen, String eco, String moves, String openingName) {
        this.eco = eco;
        this.moves = moves;
        this.openingName = openingName;
        this.fen = fen;
    }

    public String getFen() {
        return this.fen;
    }

    public void setFen(String fen) {
        this.fen = fen;
    }

    public String getOpeningName() {
        return this.openingName;
    }

    public void setOpeningName(String openingName) {
        this.openingName = openingName;
    }

    public String getMoves() {
        return this.moves;
    }

    public void setMoves(String moves) {
        this.moves = moves;
    }

    public String getEco() {
        return this.eco;
    }

    public void setEco(String eco) {
        this.eco = eco;
    }
}
