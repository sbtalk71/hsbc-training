package com.demo.app.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;

import com.demo.dao.EmpDao;
import com.demo.io.entity.Emp;

public class EmpDaoFileSystemImpl implements EmpDao {
	String message;

	@Override
	public String save(Emp e) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("emp1.txt");
			br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {

				if (line.contains("" + e.getId())) {
					message = "Emp already exists";

					return message;

				}
			}

			fw = new FileWriter("emp1.txt", true);
			bw = new BufferedWriter(fw);
			String empData = e.getId() + ", " + e.getName() + "," + e.getLoc() + "," + e.getSal();
			bw.write(empData);
			bw.flush();
			message = "Emp written to file";
		} catch (Exception ee) {
			System.out.println(ee);
		}

		return message;
	}

}
