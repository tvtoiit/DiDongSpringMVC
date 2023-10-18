package ProjectSmartphoneMVC.Service.user;

import org.springframework.stereotype.Service;

import ProjectSmartphoneMVC.Dto.PaginatesDto;
@Service
public interface IPaginatesService {
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int curenPage);
}
