// 函数: _ZN14ascensionrules47CStateProcessAcquireOrDefeatAllCardsInCenterRow10EnterStateER13CStateMachine
// 地址: 0x12ddfc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x24c)
int32_t r6 = 0x6a8
*(arg1 + 0x43c) = 0
*(arg1 + 0x25c) = 0
int32_t i = 0
*(arg1 + 0x67c) = 0
*(arg1 + 0x680) = 0
*(arg1 + 0x6cc) = 0
int32_t r9 = *(r0 + 4)

do
    void* r0_1 = arg1 + i
    *(r0_1 + 0x6c4) = 0
    *(r0_1 + 0x6a0) = 0
    void* r5_2 = arg1 + r6
    *r5_2 = 0
    *(r5_2 - 0x24) = 0
    void* r0_3 = ascension::CWorld::GetCenterRowCard(r9)
    
    if (r0_3 != 0)
        int32_t r2_1 = *(arg1 + 0x250)
        int32_t r1_3 = *(*(r0_3 + 0xc) + 0x88)
        
        if (r2_1 == 0 || (r2_1 & 1 << (r1_3 & 0xff)) != 0)
            if (r1_3 - 1 u< 2)
                *(r5_2 - 0x24) = r0_3
            else if (r1_3 == 3)
                *(arg1 + r6) = r0_3
            else if (r1_3 == 8 && *(r9 + 0x30) u>= 0x15)
                *(r5_2 - 0x24) = r0_3
    
    i += 1
    r6 += 4
while (i != 7)

int32_t r0_4 = *(r9 + 0x30)

if (r0_4 u> 0xc)
    void* r2_3 = *(arg1 + 0x24c)
    int32_t* i_1 = *(r2_3 + 0x54)
    
    if (i_1 != *(r2_3 + 0x58))
        do
            void* r3_1 = *i_1
            
            if (zx.d(*(*(*(r3_1 + 0x10) + 0xc) + 0xcb)) != 0)
                int32_t* r7_3 = *(r3_1 + 0x48)
                
                if (*(r3_1 + 0x4c) - r7_3 == 4)
                    int32_t r6_3
                    
                    if (r0_4 u>= 0x17)
                        r6_3 = *(arg1 + 0x250)
                    
                    if (r0_4 u< 0x17 || r6_3 == 0
                            || (r6_3 & 1 << zx.d((*(*(*r7_3 + 0xc) + 0x88)).b)) != 0)
                        int32_t r7_7 = *(arg1 + 0x6cc)
                        *(arg1 + 0x6cc) = r7_7 + 1
                        *(arg1 + (r7_7 << 2) + 0x6d0) = r3_1
            
            i_1 = &i_1[1]
        while (i_1 != *(*(arg1 + 0x24c) + 0x58))

return ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::BuildAcquireOrDefeatOptions(
    arg1) __tailcall
