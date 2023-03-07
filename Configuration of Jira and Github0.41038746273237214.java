
@RestController
public class SwamiController {
	
	private final SwamiService swamiService;
	
	public SwamiController(SwamiService swamiService) {
		this.swamiService = swamiService;
	}
	
	@GetMapping("/swami")
	public String selectService(@RequestParam String service) {
		return swamiService.selectService(service);
	}
	
	@PostMapping("/swami/configure")
	public void configureJiraAndGithub(@RequestBody Credentials credentials) {
		swamiService.configureJiraAndGithub(credentials);
	}
}

@Service
public class SwamiService {
	
	private final SwamiRepository swamiRepository;
	
	public SwamiService(SwamiRepository swamiRepository) {
		this.swamiRepository = swamiRepository;
	}
	
	public String selectService(String service) {
		return swamiRepository.selectService(service);
	}
	
	public void configureJiraAndGithub(Credentials credentials) {
		swamiRepository.configureJiraAndGithub(credentials);
	}
}

@Repository
public class SwamiRepository {
	
	public String selectService(String service) {
		// logic to select service
	}
	
	public void configureJiraAndGithub(Credentials credentials) {
		// logic to configure Jira and Github
	}
}