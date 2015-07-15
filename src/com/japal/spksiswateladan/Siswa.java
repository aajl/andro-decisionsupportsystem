package com.japal.spksiswateladan;

public class Siswa {

	int _id;
	int _thn;
	String _kls;
	String _nama;
	int _k1;
	int _k2;
	int _k3;
	int _k4;
	int _k5;
	
	public Siswa(){
		
	}
	
	public Siswa(int _id, int _thn, String _kls, String _nama, int _k1,
			int _k2, int _k3, int _k4, int _k5) {
		super();
		this._id = _id;
		this._thn = _thn;
		this._kls = _kls;
		this._nama = _nama;
		this._k1 = _k1;
		this._k2 = _k2;
		this._k3 = _k3;
		this._k4 = _k4;
		this._k5 = _k5;
	}

	public Siswa(int _thn, String _kls, String _nama, int _k1, int _k2,
			int _k3, int _k4, int _k5) {
		super();
		this._thn = _thn;
		this._kls = _kls;
		this._nama = _nama;
		this._k1 = _k1;
		this._k2 = _k2;
		this._k3 = _k3;
		this._k4 = _k4;
		this._k5 = _k5;
	}



	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public int get_thn() {
		return _thn;
	}

	public void set_thn(int _thn) {
		this._thn = _thn;
	}

	public String get_kls() {
		return _kls;
	}

	public void set_kls(String _kls) {
		this._kls = _kls;
	}

	public String get_nama() {
		return _nama;
	}

	public void set_nama(String _nama) {
		this._nama = _nama;
	}

	public int get_k1() {
		return _k1;
	}

	public void set_k1(int _k1) {
		this._k1 = _k1;
	}

	public int get_k2() {
		return _k2;
	}

	public void set_k2(int _k2) {
		this._k2 = _k2;
	}

	public int get_k3() {
		return _k3;
	}

	public void set_k3(int _k3) {
		this._k3 = _k3;
	}

	public int get_k4() {
		return _k4;
	}

	public void set_k4(int _k4) {
		this._k4 = _k4;
	}

	public int get_k5() {
		return _k5;
	}

	public void set_k5(int _k5) {
		this._k5 = _k5;
	}
}
