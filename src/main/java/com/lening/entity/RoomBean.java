package com.lening.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "h_room")
public class RoomBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;
    private Integer roomType;
    private double roomPrice;
    private String roomFloor;
    private String roomState;
    private Long userId;

    @Transient
    private RoomTypeBean roomTypeBean;
    @Transient
    private UserBean userBean;
    @ManyToOne
    private RoomTypeBean roomtype = new RoomTypeBean();

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(String roomFloor) {
        this.roomFloor = roomFloor;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public RoomTypeBean getRoomTypeBean() {
        return roomTypeBean;
    }

    public void setRoomTypeBean(RoomTypeBean roomTypeBean) {
        this.roomTypeBean = roomTypeBean;
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

    public RoomTypeBean getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(RoomTypeBean roomtype) {
        this.roomtype = roomtype;
    }
}
