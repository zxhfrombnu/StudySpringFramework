package com.helen.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMongoApplication {

//	// way1 : use MongoDbFactory
//	@Autowired
//	private MongoDbFactory mongoDbFactory;
//
//	// uri : http://localhost:8080/stocks
//	@RequestMapping("/stocks")
//	private DBObject stocks() {
//		DB db = mongoDbFactory.getDb("sandbox");
//		DBCollection collection = db.getCollection("stocks");
//		collection.insert(new BasicDBObject()
//				.append("companyName", "Ford")
//				.append("symbol", "F"));
//		return collection.findOne(new BasicDBObject()
//				.append("symbol", "F"));
//	}
	
//	// way2 : use MongoTemplate
//	@Autowired
//	private MongoTemplate template;
//  // uri : http://localhost:8080/stocks
//	@RequestMapping("/stocks")
//	private Stock stocks() {
//		Stock stock = new Stock();
//		stock.setCompanyName("Tesla");
//		stock.setSymbol("TLSA");
//		stock.setCeo("Elon Musk");
//		stock.setPrice(250.00d);
//		template.insert(stock, "stock");
//		return template.findOne(new BasicQuery("{symbol:'TLSA'}") , Stock.class);
//	}

	// way3: use Repository
	@Autowired
	private StockRepository stockRepository;

	// uri : http://localhost:8080/stocks
	@RequestMapping("/stocks")
	private Stock stocks() {
		Stock stock = new Stock();
		stock.setStockId(1);
		stock.setCompanyName("Shop");
		stock.setSymbol("Shop");
		stock.setCeo("Helen");
		stock.setPrice(250.00d);
		
		stockRepository.save(stock);
		return stockRepository.findBySymbol("Shop");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoApplication.class, args);
	}
}
