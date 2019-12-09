package com.example.projet_2020.data.model;
import android.location.Location;
import android.telecom.PhoneAccount;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName="Deliveries")
public class Delivery {
    @PrimaryKey(autoGenerate=true)
    ParcelType parcelType;
    boolean fragile;
    ParcelWeight parcelWeight;
    Location location;//from GPS
    Receptor receptor;
    String phoneAccount;


    public Delivery(ParcelType parcelType, boolean fragile, ParcelWeight parcelWeight, Location location, Receptor receptor, String phoneAccount) {
        this.parcelType = parcelType;
        this.fragile = fragile;
        this.parcelWeight = parcelWeight;
        this.location = location;
        this.receptor = receptor;
        this.phoneAccount = phoneAccount;
    }




    public ParcelType getParcelType() {
        return parcelType;
    }

    public void setParcelType(ParcelType parcelType) {
        this.parcelType = parcelType;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public ParcelWeight getParcelWeight() {
        return parcelWeight;
    }

    public void setParcelWeight(ParcelWeight parcelWeight) {
        this.parcelWeight = parcelWeight;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Receptor getReceptor() {
        return receptor;
    }

    public void setReceptor(Receptor receptor) {
        this.receptor = receptor;
    }

    public String getPhoneAccount() {
        return phoneAccount;
    }

    public void setPhoneAccount(String phoneAccount) {
        this.phoneAccount = phoneAccount;
    }


}
