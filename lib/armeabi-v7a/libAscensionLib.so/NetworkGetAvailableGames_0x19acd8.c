// 函数: NetworkGetAvailableGames
// 地址: 0x19acd8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r7 = arg1
uint32_t r4 = *s_pNetworkClientManager
int32_t r0 = *(r4 + 0xd0)
int32_t r1_1 = *(r4 + 0xd4) - r0

if (r1_1 s< 1)
    return 0

int32_t r5_1 = r1_1 s>> 2
int32_t r1_2 = arg4 & 2
int32_t r1_3 = arg4 & 4
int32_t result = 0
int32_t r9_1 = 0
int32_t r1_4 = arg4 & 1
int32_t var_2c_1 = arg4
int32_t var_30_1 = arg3

while (true)
    int32_t* r10_1 = *(r0 + (r9_1 << 2))
    
    if ((zx.d(*(r10_1 + 6)) & 1) != 0 && (arg3 == 0 || (arg3 & 1 << zx.d(r10_1[1].b - 2)) != 0))
        if (arg4 == 0)
        label_19adc0:
            
            if (result s>= arg2)
                return result
            
            strncpy(r7 + 0xc, r10_1 + 0x12, 0x20)
            *(r7 + 0x2b) = 0
            strncpy(r7 + 0x2c, r10_1 + 0x46, 0x20)
            *(r7 + 0x4b) = 0
            strncpy(r7 + 0x4c, r10_1 + 0x7a, 0x20)
            *(r7 + 0x6b) = 0
            strncpy(r7 + 0x6c, r10_1 + 0xae, 0x20)
            *(r7 + 0x8b) = 0
            result += 1
            *(r7 + 0x8c) = *r10_1
            *(r7 + 0x90) = zx.d(r10_1[0x37].w)
            uint32_t r0_14 = zx.d(*(r10_1 + 0xde))
            *(r7 + 0xa0) = 0
            *(r7 + 0xa4) = 0
            *(r7 + 0xa8) = 0
            *(r7 + 0xac) = 0
            *(r7 + 0xb4) = 0
            *(r7 + 0x98) = 0
            *(r7 + 0x94) = r0_14
            *(r7 + 0xb8) = r10_1[4].w
            *(r7 + 0xba) = r10_1[0x11].w
            *(r7 + 0xbc) = r10_1[0x1e].w
            *(r7 + 0xbe) = r10_1[0x2b].w
            *(r7 + 0xc0) = *(r10_1 + 0xe)
            *(r7 + 0xc2) = *(r10_1 + 0x42)
            *(r7 + 0xc4) = *(r10_1 + 0x76)
            *(r7 + 0xc6) = *(r10_1 + 0xaa)
            uint32_t r0_23 = zx.d(*(r10_1 + 6))
            arg3 = var_30_1
            arg4 = var_2c_1
            *(r7 + 0xc8) = r0_23 & 1
            *(r7 + 0xcc) = r0_23 u>> 1 & 1
            *(r7 + 0xd0) = r0_23 u>> 2 & 1
            *(r7 + 0xd4) = r0_23 u>> 3 & 1
            *(r7 + 0xec) = zx.d(r10_1[3].w)
            *(r7 + 0xf0) = zx.d(r10_1[0x10].w)
            *(r7 + 0xf4) = zx.d(r10_1[0x1d].w)
            *(r7 + 0xf8) = zx.d(r10_1[0x2a].w)
            *(r7 + 0xd8) = r10_1[0x36]
            *(r7 + 0xdc) = r10_1[2]
            *(r7 + 0xe0) = r10_1[0xf]
            *(r7 + 0xe4) = r10_1[0x1c]
            *(r7 + 0xe8) = r10_1[0x29]
            *(r7 + 0xfc) = sx.d(*(r10_1 + 5)) | sx.d(r10_1[1].b) << 0x10
            r7 += 0x108
        else
            int32_t r0_4 = r10_1[0x36]
            
            if (r0_4 u>= &__elf_symbol_table[0x4f9])
                int32_t r0_6
                
                if (r0_4 u<= &(*__elf_hash_table.chains)[0xcad])
                    r0_6 = r1_2
                else
                    r0_6 = r1_3
                
                if (r0_6 != 0)
                    goto label_19adc0
            else if (r1_4 != 0)
                goto label_19adc0
    
    r9_1 += 1
    
    if (r9_1 s>= r5_1)
        if (r1_1 s>= 1)
            int32_t r9_2 = 0
            
            do
                int32_t* r6_2 = *(*(r4 + 0xd0) + (r9_2 << 2))
                
                if ((zx.d(*(r6_2 + 6)) & 1) == 0
                        && (arg3 == 0 || (arg3 & 1 << zx.d(r6_2[1].b - 2)) != 0))
                    int32_t r0_42
                    
                    if (arg4 != 0)
                        int32_t r0_41 = r6_2[0x36]
                        
                        if (r0_41 u< &__elf_symbol_table[0x4f9])
                            r0_42 = r1_4
                        else if (r0_41 u<= &(*__elf_hash_table.chains)[0xcad])
                            r0_42 = r1_2
                        else
                            r0_42 = r1_3
                    
                    if (arg4 == 0 || r0_42 != 0)
                        if (result s>= arg2)
                            break
                        
                        strncpy(r7 + 0xc, r6_2 + 0x12, 0x20)
                        *(r7 + 0x2b) = 0
                        strncpy(r7 + 0x2c, r6_2 + 0x46, 0x20)
                        *(r7 + 0x4b) = 0
                        strncpy(r7 + 0x4c, r6_2 + 0x7a, 0x20)
                        *(r7 + 0x6b) = 0
                        strncpy(r7 + 0x6c, r6_2 + 0xae, 0x20)
                        *(r7 + 0x8b) = 0
                        result += 1
                        *(r7 + 0x8c) = *r6_2
                        *(r7 + 0x90) = zx.d(r6_2[0x37].w)
                        uint32_t r0_50 = zx.d(*(r6_2 + 0xde))
                        *(r7 + 0xa0) = 0
                        *(r7 + 0xa4) = 0
                        *(r7 + 0xa8) = 0
                        *(r7 + 0xac) = 0
                        *(r7 + 0xb4) = 0
                        *(r7 + 0x98) = 0
                        *(r7 + 0x94) = r0_50
                        *(r7 + 0xb8) = r6_2[4].w
                        *(r7 + 0xba) = r6_2[0x11].w
                        *(r7 + 0xbc) = r6_2[0x1e].w
                        *(r7 + 0xbe) = r6_2[0x2b].w
                        *(r7 + 0xc0) = *(r6_2 + 0xe)
                        *(r7 + 0xc2) = *(r6_2 + 0x42)
                        *(r7 + 0xc4) = *(r6_2 + 0x76)
                        *(r7 + 0xc6) = *(r6_2 + 0xaa)
                        uint32_t r0_59 = zx.d(*(r6_2 + 6))
                        arg3 = var_30_1
                        arg4 = var_2c_1
                        *(r7 + 0xc8) = r0_59 & 1
                        *(r7 + 0xcc) = r0_59 u>> 1 & 1
                        *(r7 + 0xd0) = r0_59 u>> 2 & 1
                        *(r7 + 0xd4) = r0_59 u>> 3 & 1
                        *(r7 + 0xec) = zx.d(r6_2[3].w)
                        *(r7 + 0xf0) = zx.d(r6_2[0x10].w)
                        *(r7 + 0xf4) = zx.d(r6_2[0x1d].w)
                        *(r7 + 0xf8) = zx.d(r6_2[0x2a].w)
                        *(r7 + 0xd8) = r6_2[0x36]
                        *(r7 + 0xdc) = r6_2[2]
                        *(r7 + 0xe0) = r6_2[0xf]
                        *(r7 + 0xe4) = r6_2[0x1c]
                        *(r7 + 0xe8) = r6_2[0x29]
                        *(r7 + 0xfc) = sx.d(*(r6_2 + 5)) | sx.d(r6_2[1].b) << 0x10
                        r7 += 0x108
                
                r9_2 += 1
            while (r9_2 s< r5_1)
        
        return result
    
    r0 = *(r4 + 0xd0)
