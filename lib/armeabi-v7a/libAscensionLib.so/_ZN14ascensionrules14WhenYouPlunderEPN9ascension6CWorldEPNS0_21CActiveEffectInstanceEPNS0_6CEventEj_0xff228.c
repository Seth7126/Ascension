// 函数: _ZN14ascensionrules14WhenYouPlunderEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xff228
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *(arg3 + 4)
int32_t result = 0
int32_t r0_10

if (r0 == 0x1b)
    void* r6_2 = *(arg3 + 0x4c)
    
    if (*(arg2 + 0x14) == r6_2 && r6_2 == *(arg1 + 0xb20))
        int32_t r0_14 = *(arg3 + 0x54)
        
        if (r0_14 u<= 9 && (0x290 & 1 << (r0_14 & 0xff)) != 0 && *(arg3 + 0x50) != 0)
            if (zx.d(*(arg1 + 0xa14)) == 0
                    && ascension::CWorld::GetAcquiredCardCountFromCenterRow() s>= 1)
                int32_t var_20_2 = 0
                ascension::CWorld::OutputEvent(arg1, 0x42, zx.d(*(r6_2 + 8)), 0)
            
            r0_10 = ascension::CWorld::GetAcquiredCardCountFromCenterRow()
            result = 0
        label_ff360:
            
            if (r0_10 s> 0)
                return 1
else if (r0 == 0x12)
    int32_t r0_1 = *(arg3 + 0x54)
    
    if (r0_1 == 9 || r0_1 == 7)
        void* r6_1 = *(arg3 + 0x4c)
        
        if (*(arg2 + 0x14) == r6_1 && r6_1 == *(arg1 + 0xb20) && *(arg3 + 0x50) != 0)
            if (zx.d(*(arg1 + 0xa14)) == 0
                    && ascension::CWorld::CountDefeatedMonsterListFromCenterRow(arg1) s>= 1)
                int32_t var_20_1 = 0
                ascension::CWorld::OutputEvent(arg1, 0x42, zx.d(*(r6_1 + 8)), 0)
            
            result = 0
            r0_10 = ascension::CWorld::CountDefeatedMonsterListFromCenterRow(arg1)
            goto label_ff360
return result
