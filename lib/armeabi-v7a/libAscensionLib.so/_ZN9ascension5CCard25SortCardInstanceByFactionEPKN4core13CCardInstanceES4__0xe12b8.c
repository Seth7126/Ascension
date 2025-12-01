// 函数: _ZN9ascension5CCard25SortCardInstanceByFactionEPKN4core13CCardInstanceES4_
// 地址: 0xe12b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r2 = *(arg2 + 0xc)
void* r1 = *(arg1 + 0xc)
uint32_t i_1 = *(r2 + 0x8c)
int32_t r3 = *(r1 + 0x8c)

if (r3 == i_1)
    int32_t r12_1 = *(r2 + 0x88)
    int32_t r3_1 = *(r1 + 0x88)
    
    if (r3_1 == r12_1)
    label_e12e0:
        int32_t r12_2 = *(r2 + 0xa4)
        int32_t r3_2 = *(r1 + 0xa4)
        
        if (r3_2 == r12_2)
            return strcmp(r2 + 4, r1 + 4) u>> 0x1f
        
        if (r12_2 s< r3_2)
            return 1
        
        return 0
    
    if (r3_1 == 3)
        return 1
    
    if (r12_1 != 3)
        if (r3_1 == 6)
            return 1
        
        if (r12_1 == 6)
            return 0
        
        goto label_e12e0
else if (r3 != 0)
    int32_t temp0 = 0
    uint32_t i = i_1
    
    while (i != 0)
        i u>>= 1
        temp0 += 1
    
    int32_t r1_2 = 0
    
    if (r3 s< i_1)
        r1_2 = 1
    
    return (0x20 - temp0) u>> 5 | r1_2

return 0
