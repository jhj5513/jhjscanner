package jhj.scanner.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jhj.scanner.dao.ScannerDAO;

@Service
public class ScannerServiceImpl implements ScannerService {

	
	@Qualifier("dao")
	ScannerDAO dao;
	
	@Override
	public void process_run(String url) {
		// TODO Auto-generated method stub
		url = "ÆÄÀÏ";
		dao.process_run(url);
	}

}
