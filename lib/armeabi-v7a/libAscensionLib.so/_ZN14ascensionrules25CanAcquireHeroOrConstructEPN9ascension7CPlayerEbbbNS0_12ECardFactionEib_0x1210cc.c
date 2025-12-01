// 函数: _ZN14ascensionrules25CanAcquireHeroOrConstructEPN9ascension7CPlayerEbbbNS0_12ECardFactionEib
// 地址: 0x1210cc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6 = *(arg1 + 4)
int32_t r9 = arg4
int32_t r8 = arg5.d
int32_t r5 = arg3
int32_t r10 = *(r6 + 0x30)

if (arg2 == 0)
    int32_t* i = *(r6 + 0xa30)
    
    if (i != *(r6 + 0xa34))
        do
            void* r0_2 = *i
            
            if (*(r0_2 + 0x10) != 0)
                int32_t* r7_1 = *(r0_2 + 0xc)
                int32_t r0_3 = r7_1[0x22]
                
                if (r0_3 == 2)
                    if (r9 != 0)
                    label_12114c:
                        int32_t r0_5
                        
                        if (r8 != 0)
                            r0_5 = ascension::CCard::IsCardFaction(r7_1)
                        
                        if (r8 == 0 || r0_5 != 0)
                            int32_t result = 1
                            
                            if (arg6 s< 0)
                                return result
                            
                            int32_t r1_3 = 0x98
                            
                            if (r10 u< 0x14)
                                r1_3 = 0x9c
                            
                            int32_t r1_4 = *(r7_1 + r1_3)
                            
                            if (arg7.d != 0)
                                r1_4 += r7_1[0x28]
                            
                            if (r1_4 s<= arg6)
                                return result
                else if (r0_3 == 1 && r5 != 0)
                    goto label_12114c
            
            i = &i[1]
        while (i != *(r6 + 0xa34))

int32_t r7_2 = 0

while (true)
    void* r0_7 = ascension::CWorld::GetCenterRowCard(r6)
    
    if (r0_7 != 0)
        int32_t* r4_1 = *(r0_7 + 0xc)
        int32_t r0_8 = r4_1[0x22]
        
        if (r0_8 == 2)
            if (r9 != 0)
            label_1211ec:
                int32_t r0_10
                
                if (r8 != 0)
                    r0_10 = ascension::CCard::IsCardFaction(r4_1)
                
                if (r8 == 0 || r0_10 != 0)
                    if (arg6 s< 0)
                        break
                    
                    int32_t r1_8 = 0x98
                    
                    if (r10 u< 0x14)
                        r1_8 = 0x9c
                    
                    int32_t r1_9 = *(r4_1 + r1_8)
                    
                    if (arg7.d != 0)
                        r1_9 += r4_1[0x28]
                    
                    if (r1_9 s<= arg6)
                        break
        else if (r0_8 == 1 && r5 != 0)
            goto label_1211ec
    
    r7_2 += 1
    
    if (r7_2 u>= 7)
        return 0

return 1
