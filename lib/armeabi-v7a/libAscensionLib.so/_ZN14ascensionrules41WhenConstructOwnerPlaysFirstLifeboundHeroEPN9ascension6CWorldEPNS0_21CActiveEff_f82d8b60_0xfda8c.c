// 函数: _ZN14ascensionrules41WhenConstructOwnerPlaysFirstLifeboundHeroEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfda8c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 0x14)
    core::CCardInstance* r1 = *(arg3 + 0x4c)
    
    if (r1 == *(*(arg2 + 0x10) + 0xc))
        core::CCardInstance* r6_1 = *(arg3 + 0x50)
        
        if ((*(*(r6_1 + 0xc) + 0x88) | 8) == 9
                && ascension::CWorld::QueryCardFaction(arg1, r1, r6_1) != 0)
            result = 1
            
            if (*(arg1 + 0x30) u<= 0xf)
                int32_t temp0 = 0
                uint32_t i = ascension::CWorld::GetPlayedHeroCount(arg1, 2, r6_1)
                
                while (i != 0)
                    i u>>= 1
                    temp0 += 1
                
                return (0x20 - temp0) u>> 5

return result
