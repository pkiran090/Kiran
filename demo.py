from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support.ui import Select

service = Service(ChromeDriverManager().install())
driver = webdriver.Chrome(service=service)

driver.get("https://google.com")
driver.find_element(By.XPATH, "//a[@aria-label='Search for Images ']").click()
driver.implicitly_wait()

aa=driver.switch_to.alert


action = ActionChains(driver)

action.move_to_element()
