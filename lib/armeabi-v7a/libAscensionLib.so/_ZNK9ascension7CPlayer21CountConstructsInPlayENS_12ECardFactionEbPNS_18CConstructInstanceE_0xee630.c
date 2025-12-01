// 函数: _ZNK9ascension7CPlayer21CountConstructsInPlayENS_12ECardFactionEbPNS_18CConstructInstanceE
// 地址: 0xee630
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r5 = arg1
ascension::CPlayer* r0 = *(arg1 + 4)
int32_t* i = *(r5 + 0x54)
int32_t r4 = *(r5 + 0x58)
int32_t result
int32_t entry_r3

if (arg2 != 0)
    int32_t var_2c_1
    ascension::CConstructInstance* r4_1
    
    if (i == r4)
        result = 0
        var_2c_1 = 0
        r4_1 = arg3
    else
        result = 0
        r4_1 = arg3
        var_2c_1 = 0
        
        do
            void* r1 = *i
            
            if (r1 != entry_r3)
                void* r2 = *(r1 + 0x10)
                void* r8_1 = *(r2 + 0xc)
                
                if ((r4_1 == 0 || *(r8_1 + 0x154) != 0)
                        && ascension::CWorld::QueryCardFaction(r0, r5, r2) != 0)
                    int32_t r0_3 = var_2c_1
                    result += *(r8_1 + 0xcc)
                    
                    if (*(r8_1 + 0x88) == 3)
                        r0_3 += 1
                    
                    var_2c_1 = r0_3
            
            i = &i[1]
        while (i != *(r5 + 0x58))
    
    if (arg2 == 3 && r4_1 == 0)
        if (*(r0 + 0xb20) == r5)
            result += *(r0 + 0xb68)
        
        if (*(r5 + 0xa8) s> 0)
            return result + var_2c_1
else
    int32_t r12_1
    
    if (i == r4)
        r12_1 = 0
        result = 0
        
        if (arg3 == 0)
        label_ee7a8:
            
            if (*(r0 + 0xb20) == r5)
                result += *(r0 + 0xb68)
            
            if (*(r5 + 0xa8) s> 0)
                return result + r12_1
    else
        result = 0
        r12_1 = 0
        
        do
            void* r1_5 = *i
            
            if (r1_5 != entry_r3)
                void* r1_7 = *(*(r1_5 + 0x10) + 0xc)
                
                if (arg3 == 0 || *(r1_7 + 0x154) != 0)
                    if (*(r1_7 + 0x88) == 3)
                        r12_1 += 1
                    
                    result += *(r1_7 + 0xcc)
            
            i = &i[1]
        while (r4 != i)
        
        if (arg3 == 0)
            goto label_ee7a8
return result
