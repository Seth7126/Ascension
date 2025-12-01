// 函数: _ZN9ascension5CCard32InverseSortCardInstanceByFactionEPKN4core13CCardInstanceES4_
// 地址: 0xe137c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r2 = *(arg2 + 0xc)
void* r1 = *(arg1 + 0xc)
int32_t r0 = *(r2 + 0x8c)
int32_t r3 = *(r1 + 0x8c)

if (r3 == r0)
    int32_t r12_1 = *(r2 + 0x88)
    int32_t r3_1 = *(r1 + 0x88)
    
    if (r3_1 == r12_1)
    label_e13a4:
        int32_t r12_2 = *(r2 + 0xa4)
        int32_t r3_2 = *(r1 + 0xa4)
        
        if (r3_2 != r12_2)
            if (r12_2 s> r3_2)
                return 1
            
            return 0
        
        if (strcmp(r2 + 4, r1 + 4) s> 0)
            return 1
        
        return 0
    
    if (r3_1 == 3)
        return 0
    
    if (r12_1 != 3)
        if (r3_1 == 6)
            return 0
        
        if (r12_1 == 6)
            return 1
        
        goto label_e13a4
else if (r3 != 0)
    int32_t r1_3 = 0
    
    if (r3 s> r0)
        r1_3 = 1
    
    if (r0 != 0)
        r0 = 1
    
    return r1_3 & r0

return 1
