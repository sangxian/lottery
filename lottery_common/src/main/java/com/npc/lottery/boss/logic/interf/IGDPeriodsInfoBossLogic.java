package com.npc.lottery.boss.logic.interf;

import java.util.List;
import java.util.Map;

import org.hibernate.criterion.Criterion;

import com.npc.lottery.periods.entity.GDPeriodsInfo;
import com.npc.lottery.util.Page;

public interface IGDPeriodsInfoBossLogic {

    public List<GDPeriodsInfo> queryAllPeriods();
    
    public GDPeriodsInfo queryByPeriods(String periodsNum,Object number);
    
    public GDPeriodsInfo queryPeriods(Object periodsNum,Object status);

    public void saveGDPeriods();
    
    public void save(GDPeriodsInfo gdPeriodsInfo);
    
    public List<GDPeriodsInfo> queryAllPeriods(Criterion... criterias);
    
    public GDPeriodsInfo queryByPeriods(Criterion...criterias);
    
    public GDPeriodsInfo queryByPeriodsStatus(String status);
    
    public void updateCommon(String commonDate);
    public List<GDPeriodsInfo> queryTodayPeriods();
    
    public Page<GDPeriodsInfo> queryHistoryPeriods(Page<GDPeriodsInfo> page);
    
    public Page<GDPeriodsInfo> queryHistoryPeriodsForBoss(Page<GDPeriodsInfo> page,String state);
    //保存修改广东快乐十分的开奖结果
    public void updateLotResult(GDPeriodsInfo gdPeriodsInfo);
    //封盘
    public void updateGDStatus();
    public GDPeriodsInfo queryLastLotteryPeriods();
    public GDPeriodsInfo queryLastLotteryPeriods_noTime();
    public GDPeriodsInfo queryLastNotOpenPeriods();
    public List<GDPeriodsInfo> queryLastPeriodsForRefer();
    public void updatePeriodsStatusByPeriodsNum(String periodsNum,String status);
    public GDPeriodsInfo queryStopPeriods(String status);
    
    public void update(GDPeriodsInfo gdPeriodsInfo);
    
    public List<GDPeriodsInfo> queryByGDPeriods(String periodsNum,String number);
    
    public void deletePeriods(String beginPeriodsNum,String endPeriodsNum);
    
    public List<GDPeriodsInfo> queryReportPeriodsNum();
    
    public List<GDPeriodsInfo> queryPeriods(String beginPeriodsNum,String endPeriodsNum);

    public List<GDPeriodsInfo> queryTodayAllPeriods();

    public Page<GDPeriodsInfo> findPage(Page<GDPeriodsInfo> page,
			Criterion[] criterions);

    /**
     * 查看当前正在运行的盘期
     * 条件:开盘后,开奖前
     **/
	public GDPeriodsInfo queryZhangdanPeriods();

	public List<GDPeriodsInfo> queryBeforeRunPeriodsNumList(Integer row);
	
	/**
	 * 从第三方网站获取广东快乐十分开奖信息
	 * @return
	 */
	public Map<String, List<Integer>> getResult();
}
