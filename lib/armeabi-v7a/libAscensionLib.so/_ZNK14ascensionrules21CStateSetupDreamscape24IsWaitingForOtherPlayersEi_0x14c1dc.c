// 函数: _ZNK14ascensionrules21CStateSetupDreamscape24IsWaitingForOtherPlayersEi
// 地址: 0x14c1dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (CGameStateSimultaneous::GetPlayerTopState(arg1) == 0)
    int32_t r1_1 = *(arg1 + 0x158)
    int32_t r2_1 = *(r1_1 + 0x18)
    int32_t r3_1 = *(r1_1 + 0x1c)
    
    if (r3_1 != r2_1)
        int32_t r6 = 0
        
        while (true)
            int32_t entry_r1
            
            if (*(ascension::CWorld::GetPlayer(r1_1) + 0xc) != entry_r1
                    && CGameStateSimultaneous::GetPlayerTopState(arg1) != 0)
                return 1
            
            r6 += 1
            
            if (r6 u>= (r3_1 - r2_1) s>> 2)
                break
            
            r1_1 = *(arg1 + 0x158)

return 0
