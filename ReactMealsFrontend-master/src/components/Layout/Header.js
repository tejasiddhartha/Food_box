import mealsImage from '../../assets/meals.jpg';

import styles from './Header.module.css';
import HeaderCartButton from './HeaderCartButton';

const Header = (props) => {
  return (
    <>
      <header className={styles.header}>
          <h2>ReactMeals</h2>
          <HeaderCartButton onShowCart={props.onShowCart}/>
      </header>
      <div className={styles["main-image"]}>
          <img src={mealsImage} alt="A table full of food"/>
      </div>
    </>
  );
};

export default Header;
