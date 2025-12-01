// 函数: _ZN9ascension9CDatabaseD1Ev
// 地址: 0xe5818
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* entry_r0
int32_t r1 = *entry_r0
int32_t* r2 = entry_r0[1]

while (r1 != r2)
    r2 -= 4
    int32_t* r0 = *r2
    entry_r0[1] = r2
    
    if (r0 != 0)
        (*(*r0 + 4))()
        r1 = *entry_r0
        r2 = entry_r0[1]

while (true)
    int32_t r1_5 = entry_r0[3]
    int32_t* r2_1 = entry_r0[4]
    int32_t* i
    
    do
        if (r1_5 == r2_1)
            int32_t* r1_6 = entry_r0[6]
            int32_t* r0_1 = entry_r0[7]
            
            if (r1_6 == r0_1)
                r0_1 = r1_6
            else
                do
                    r0_1 -= 4
                    int32_t r5_1 = *r0_1
                    entry_r0[7] = r0_1
                    
                    if (r5_1 != 0)
                        operator delete(ascension::CEffectList::~CEffectList())
                        r1_6 = entry_r0[6]
                        r0_1 = entry_r0[7]
                while (r1_6 != r0_1)
            
            void* r1_7 = entry_r0[9]
            
            if (r1_7 != 0)
                operator delete[](r1_7)
                r0_1 = entry_r0[6]
            
            if (r0_1 != 0)
                entry_r0[7] = r0_1
                operator delete(r0_1)
            
            void* r0_5 = entry_r0[3]
            
            if (r0_5 != 0)
                entry_r0[4] = r0_5
                operator delete(r0_5)
            
            void* r0_6 = *entry_r0
            
            if (r0_6 != 0)
                entry_r0[1] = r0_6
                operator delete(r0_6)
            
            return 
        
        r2_1 -= 4
        i = *r2_1
        entry_r0[4] = r2_1
    while (i == 0)
    
    (*(*i + 4))()
