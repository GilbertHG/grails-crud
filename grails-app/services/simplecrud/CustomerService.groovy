package simplecrud

import com.ghg.Customer
import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

@Service(Customer)
interface CustomerService {
    Customer get(Serializable id)

    void delete(Serializable id)

    Customer save(Customer customer)
}
