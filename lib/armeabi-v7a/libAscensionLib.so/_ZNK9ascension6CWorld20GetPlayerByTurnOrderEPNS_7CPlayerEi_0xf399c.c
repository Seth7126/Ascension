// 函数: _ZNK9ascension6CWorld20GetPlayerByTurnOrderEPNS_7CPlayerEi
// 地址: 0xf399c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* i_1 = *(arg1 + 0x18)
int32_t r12 = *(arg1 + 0x1c)

if (i_1 != r12)
    int32_t* i = i_1
    int32_t entry_r2
    
    do
        if (*i == arg2)
            for (; r12 != i; i = &i[1])
                if (entry_r2 == 0)
                    return *i
                
                entry_r2 -= 1
            
            break
        
        i = &i[1]
    while (r12 != i)
    
    if (i_1 != r12)
        int32_t r2 = not.d(entry_r2)
        
        do
            int32_t result = *i_1
            
            if (result == arg2)
                break
            
            int32_t temp1_1 = r2
            r2 += 1
            
            if (temp1_1 == 0xffffffff)
                return result
            
            i_1 = &i_1[1]
        while (r12 != i_1)

return 0
