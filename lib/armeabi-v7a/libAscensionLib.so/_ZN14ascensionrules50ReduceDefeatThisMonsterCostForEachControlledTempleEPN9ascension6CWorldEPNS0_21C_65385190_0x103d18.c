// 函数: _ZN14ascensionrules50ReduceDefeatThisMonsterCostForEachControlledTempleEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x103d18
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 8 && *(arg3 + 0x4c) != 0)
    int32_t r0_2 = *(arg3 + 0x50)
    result = 1
    
    if (r0_2 s>= 1)
        int32_t* r1 = *(arg3 + 0x54)
        int32_t r4_1 = 0
        int32_t r5_1 = 0
        
        do
            if (*(r1 + r4_1) == *(arg2 + 0x14))
                *(arg3 + 0x4c)
                int32_t r0_4 = ascension::CPlayer::CountTemplesInPlay()
                r1 = *(arg3 + 0x54)
                void* r2_1 = r1 + r4_1
                *(r2_1 + 0xc) -= r0_4 * arg4
                r0_2 = *(arg3 + 0x50)
            
            r5_1 += 1
            r4_1 += 0x34
        while (r5_1 s< r0_2)

return result
