package com.controller;
import com.service.*;
public class UserController
{
public static void main(String[] args)
{
	System.out.println("---Main method---");
	UserService u = new UserService();
	System.out.println(u.id);
	u.m1();
}
}
