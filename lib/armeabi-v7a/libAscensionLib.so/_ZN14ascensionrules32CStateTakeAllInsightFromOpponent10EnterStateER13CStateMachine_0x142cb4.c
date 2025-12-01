// 函数: _ZN14ascensionrules32CStateTakeAllInsightFromOpponent10EnterStateER13CStateMachine
// 地址: 0x142cb4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *(arg1 + 0x24c)
ascension::CPlayer* r6 = *(r2 + 4)
int32_t r4 = *(r6 + 0x1c) - *(r6 + 0x18)

if (r4 s> 4)
    uint32_t r1_2 = zx.d(*(ascension::CWorld::GetPlayerByTurnOrder(r6, r2) + 8))
    uint32_t var_2c_1 = r1_2
    CGameStateOptions::AddSimpleUserOption(arg1.w, r1_2.w, 0xa0d2, "Take Insight from %s", 
        ascensionrules::CStateTakeAllInsightFromOpponent::SelectTakeInsight)
    
    if (r4 s>= 9)
        int32_t i = 2
        
        do
            uint32_t r1_4 =
                zx.d(*(ascension::CWorld::GetPlayerByTurnOrder(r6, *(arg1 + 0x24c)) + 8))
            uint32_t var_2c_2 = r1_4
            CGameStateOptions::AddSimpleUserOption(arg1.w, r1_4.w, 0xa0d2, "Take Insight from %s", 
                ascensionrules::CStateTakeAllInsightFromOpponent::SelectTakeInsight)
            i += 1
        while (i s< r4 s>> 2)
    
    *(arg1 + 0x24c)

jump(*(*arg1 + 0x34))
