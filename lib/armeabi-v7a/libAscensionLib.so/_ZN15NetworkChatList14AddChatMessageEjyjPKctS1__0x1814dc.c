// 函数: _ZN15NetworkChatList14AddChatMessageEjyjPKctS1_
// 地址: 0x1814dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char const* r8 = arg6
uint32_t arg_c

if (r8 == 0 || arg_c == 0)
    return 

uint32_t r4 = *(arg1 + 4)

if (r8 u>= 0xc0)
    r8 = 0xc0

if (r4 u> arg3)
    int32_t r3 = *(arg1 + 8)
    uint32_t r7_1 = r4 - arg3
    int32_t r1 = *(arg1 + 0x10)
    int32_t r2 = r3 - r4
    uint32_t r0 = r2 + 1 + r7_1
    
    if (r0 u<= r1)
        int32_t r0_5 = r2 + r7_1
        
        if (r2 + r7_1 u>= r2)
            int32_t r1_4 = (r3 << 2) - (r4 << 2)
            
            do
                int32_t* r2_5 = *(arg1 + 0x14)
                int32_t r3_2 = *(r2_5 + r1_4)
                r1_4 -= 4
                r2_5[r0_5] = r3_2
                r0_5 -= 1
            while (r0_5 u>= r7_1)
        
        int32_t r1_5 = 0
        
        do
            *(*(arg1 + 0x14) + (r1_5 << 2)) = 0
            r1_5 += 1
        while (r7_1 != r1_5)
    else
        int32_t r9_1 = r1 - 4
        
        do
            r9_1 += 4
        while (r0 u> r9_1)
        
        void* r2_1 = *(arg1 + 0x14)
        uint32_t r0_1
        int32_t r1_1
        r1_1:r0_1 = mulu.dp.d(r9_1, 4)
        
        if (r1_1 != 0)
            r1_1 = 1
        
        if (r1_1 != 0)
            r0_1 = 0xffffffff
        
        int32_t* r0_2 = operator new[](r0_1)
        *(arg1 + 0x14) = r0_2
        
        if (r7_1 != 0)
            *r0_2 = 0
            
            if (r7_1 != 1)
                int32_t i = 0xffffffff
                
                do
                    *(*(arg1 + 0x14) - (i << 2)) = 0
                    i -= 1
                while (arg3 - r4 != i)
        
        void* r0_4
        
        if (r7_1 u>= r2 + 1)
            r0_4 = r2_1
            
            if (r7_1 u< r9_1)
            label_181658:
                
                do
                    *(*(arg1 + 0x14) + (r7_1 << 2)) = 0
                    r7_1 += 1
                while (r9_1 != r7_1)
        else
            int32_t r6_2 = (r4 << 3) - (arg3 << 3)
            r0_4 = r2_1
            int32_t* r1_2 = r0_4 + (r7_1 << 2)
            int32_t i_2 = r3 + arg3 + 1 - (r4 << 1)
            int32_t i_1
            
            do
                i_1 = i_2
                i_2 -= 1
                int32_t r7_2 = *r1_2
                r1_2 = &r1_2[1]
                *(*(arg1 + 0x14) + r6_2) = r7_2
                r6_2 += 4
            while (i_1 != 1)
            r7_1 = r2 + 1
            
            if (r7_1 u< r9_1)
                goto label_181658
        
        *(arg1 + 0x10) = r9_1
        
        if (r0_4 != 0)
            operator delete[](r0_4)
    
    r4 = arg3
    *(arg1 + 4) = arg3

int16_t var_30_2 = r8.w

if (r4 == 0)
    *(arg1 + 4) = arg3
    r4 = arg3

int32_t r6_3 = *(arg1 + 0x10)
uint32_t r8_1 = arg3 - r4

if (r8_1 u>= r6_3)
    *(arg1 + 0x10) = r6_3 + 4
    uint32_t r0_6
    int32_t r2_7
    r2_7:r0_6 = mulu.dp.d(r6_3 + 4, 4)
    void* r7_3 = *(arg1 + 0x14)
    
    if (r2_7 != 0)
        r2_7 = 1
    
    if (r2_7 != 0)
        r0_6 = 0xffffffff
    
    int32_t* r0_7 = operator new[](r0_6)
    *(arg1 + 0x14) = r0_7
    
    if (r6_3 != 0)
        *r0_7 = *r7_3
        
        if (r6_3 != 1)
            int32_t r0_22 = 1
            
            do
                *(*(arg1 + 0x14) + (r0_22 << 2)) = *(r7_3 + (r0_22 << 2))
                r0_22 += 1
            while (r6_3 != r0_22)
    
    if (r6_3 u< 0xfffffffc)
        *(*(arg1 + 0x14) + (r6_3 << 2)) = 0
        *(*(arg1 + 0x14) + (r6_3 << 2) + 4) = 0
        *(*(arg1 + 0x14) + (r6_3 << 2) + 8) = 0
        *(*(arg1 + 0x14) + (r6_3 << 2) + 0xc) = 0
    
    if (r7_3 != 0)
        operator delete[](r7_3)

int32_t r6_4 = *(arg1 + 0x14)
char* r9_2 = arg2:4.d
int32_t* r7_4 = *(r6_4 + (r8_1 << 2))

if (r7_4 == 0)
    int32_t* r0_16 = operator new(0x100)
    r7_4 = r0_16
    __aeabi_memclr8(r0_16, 0x100)
    *(r6_4 + (r8_1 << 2)) = r7_4

*r7_4 = arg2.d
r7_4[2] = arg4
r7_4[3] = arg5

if (r9_2 == 0)
    __aeabi_memclr(r7_4 + 0xd2, 0x1f)
else
    strcpy(r7_4 + 0xd2, r9_2)

r7_4[4].w = var_30_2
__aeabi_memcpy(r7_4 + 0x12, arg_c, zx.d(var_30_2 + 1))

if (*(arg1 + 8) u< arg3)
    *(arg1 + 8) = arg3

if (*(arg1 + 0xc) u< arg3)
    *(arg1 + 0xc) = arg3
