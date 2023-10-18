package ProjectSmartphoneMVC.Service.user;

import org.springframework.stereotype.Service;

import ProjectSmartphoneMVC.Dto.PaginatesDto;

@Service
public class PaginateServiceImplement {
	
		public PaginatesDto GetInfoPaginates(int totalData, int limit, int curenPage) {
			PaginatesDto paginate = new PaginatesDto();
			
			paginate.setLimit(limit);
			
			paginate.setTotalPage(SetInfoTotalPage(totalData, limit));
			paginate.setCurrentPage(CheckCurrentPage(curenPage, paginate.getTotalPage()));
			
			
			int start = FindStart(paginate.getCurrentPage(), limit);
			paginate.setStart(start);
			int end = FindEnd(paginate.getStart(), limit, totalData);
			paginate.setEnd(end);
			return paginate;
		}

		private int FindEnd(int start, int limit, int totalData) {
			return start + limit > totalData ? totalData : (start  + limit) - 1;
		}

		private int FindStart(int currentPage, int limit) {
			return ((currentPage - 1) *limit);
		}

		private int SetInfoTotalPage(int totalData, int limit) {
			int totalPage = 0;
			totalPage = totalData / limit;
			totalPage = totalPage * limit < totalData ? totalPage + 1 : totalPage;
			return totalPage;
		}
		//khoảng của trang
		public int CheckCurrentPage(int currenctPage, int totalPage) {
			if (currenctPage < 1) {
				return 1;
			}
			if (currenctPage > totalPage) {
				return totalPage;
			}
			return currenctPage;
		}
}
